package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CubeTransparent: ImageVector
    get() {
        if (_CubeTransparent != null) {
            return _CubeTransparent!!
        }
        _CubeTransparent = ImageVector.Builder(
            name = "Outlined.CubeTransparent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(21f, 7.5f)
                lineToRelative(-2.25f, -1.313f)
                moveTo(21f, 7.5f)
                verticalLineToRelative(2.25f)
                moveToRelative(0f, -2.25f)
                lineToRelative(-2.25f, 1.313f)
                moveTo(3f, 7.5f)
                lineToRelative(2.25f, -1.313f)
                moveTo(3f, 7.5f)
                lineToRelative(2.25f, 1.313f)
                moveTo(3f, 7.5f)
                verticalLineToRelative(2.25f)
                moveToRelative(9f, 3f)
                lineToRelative(2.25f, -1.313f)
                moveTo(12f, 12.75f)
                lineToRelative(-2.25f, -1.313f)
                moveTo(12f, 12.75f)
                verticalLineTo(15f)
                moveToRelative(0f, 6.75f)
                lineToRelative(2.25f, -1.313f)
                moveTo(12f, 21.75f)
                verticalLineTo(19.5f)
                moveToRelative(0f, 2.25f)
                lineToRelative(-2.25f, -1.313f)
                moveToRelative(0f, -16.875f)
                lineTo(12f, 2.25f)
                lineToRelative(2.25f, 1.313f)
                moveTo(21f, 14.25f)
                verticalLineToRelative(2.25f)
                lineToRelative(-2.25f, 1.313f)
                moveToRelative(-13.5f, 0f)
                lineTo(3f, 16.5f)
                verticalLineToRelative(-2.25f)
            }
        }.build()

        return _CubeTransparent!!
    }

@Suppress("ObjectPropertyName")
private var _CubeTransparent: ImageVector? = null
