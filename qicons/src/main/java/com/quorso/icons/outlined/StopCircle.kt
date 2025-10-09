package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "Outlined.StopCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9.563f)
                curveTo(9f, 9.252f, 9.252f, 9f, 9.563f, 9f)
                horizontalLineToRelative(4.874f)
                curveToRelative(0.311f, 0f, 0.563f, 0.252f, 0.563f, 0.563f)
                verticalLineToRelative(4.874f)
                curveToRelative(0f, 0.311f, -0.252f, 0.563f, -0.563f, 0.563f)
                horizontalLineTo(9.564f)
                arcTo(0.562f, 0.562f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14.437f)
                verticalLineTo(9.564f)
                close()
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
