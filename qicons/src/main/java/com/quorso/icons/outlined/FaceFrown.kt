package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.FaceFrown: ImageVector
    get() {
        if (_FaceFrown != null) {
            return _FaceFrown!!
        }
        _FaceFrown = ImageVector.Builder(
            name = "Outlined.FaceFrown",
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
                moveTo(15.182f, 16.318f)
                arcTo(4.486f, 4.486f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.016f, 15f)
                arcToRelative(4.486f, 4.486f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.198f, 1.318f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
                moveTo(9.75f, 9.75f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveTo(9f, 10.164f, 9f, 9.75f)
                reflectiveCurveTo(9.168f, 9f, 9.375f, 9f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveTo(9.375f, 9.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                lineTo(9.375f, 9.75f)
                close()
                moveTo(15f, 9.75f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveToRelative(-0.375f, -0.336f, -0.375f, -0.75f)
                reflectiveCurveToRelative(0.168f, -0.75f, 0.375f, -0.75f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveTo(14.625f, 9.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                lineTo(14.625f, 9.75f)
                close()
            }
        }.build()

        return _FaceFrown!!
    }

@Suppress("ObjectPropertyName")
private var _FaceFrown: ImageVector? = null
