package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Cube: ImageVector
    get() {
        if (_Cube != null) {
            return _Cube!!
        }
        _Cube = ImageVector.Builder(
            name = "Outlined.Cube",
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
                lineToRelative(-9f, -5.25f)
                lineTo(3f, 7.5f)
                moveToRelative(18f, 0f)
                lineToRelative(-9f, 5.25f)
                moveToRelative(9f, -5.25f)
                verticalLineToRelative(9f)
                lineToRelative(-9f, 5.25f)
                moveTo(3f, 7.5f)
                lineToRelative(9f, 5.25f)
                moveTo(3f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(9f, 5.25f)
                moveToRelative(0f, -9f)
                verticalLineToRelative(9f)
            }
        }.build()

        return _Cube!!
    }

@Suppress("ObjectPropertyName")
private var _Cube: ImageVector? = null
