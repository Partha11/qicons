package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Italic: ImageVector
    get() {
        if (_Italic != null) {
            return _Italic!!
        }
        _Italic = ImageVector.Builder(
            name = "Outlined.Italic",
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
                moveTo(5.248f, 20.246f)
                horizontalLineTo(9.05f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.696f)
                moveToRelative(-3.696f, 0f)
                lineToRelative(5.893f, -16.502f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-3.697f)
                moveToRelative(3.697f, 0f)
                horizontalLineToRelative(3.803f)
            }
        }.build()

        return _Italic!!
    }

@Suppress("ObjectPropertyName")
private var _Italic: ImageVector? = null
