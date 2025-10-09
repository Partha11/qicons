package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.H1: ImageVector
    get() {
        if (_H1 != null) {
            return _H1!!
        }
        _H1 = ImageVector.Builder(
            name = "Outlined.H1",
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
                moveTo(2.243f, 4.493f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.502f)
                moveToRelative(0f, -7.501f)
                horizontalLineToRelative(10.5f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.501f)
                moveToRelative(4.501f, -8.627f)
                lineToRelative(2.25f, -1.5f)
                verticalLineToRelative(10.126f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(2.25f, 0f)
                horizontalLineToRelative(2.25f)
            }
        }.build()

        return _H1!!
    }

@Suppress("ObjectPropertyName")
private var _H1: ImageVector? = null
